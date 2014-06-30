SECTION = "core"
DESCRIPTION = "Config file to avoid eth0 rename in enp1s0 in case of bad CRC error in uboot"
RDEPENDS_${PN} = ""
# The license is meant for this recipe and the files it installs.
# RNDIS is part of the kernel, udhcpd is part of busybox
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r1"

PACKAGE_ARCH = "all"

SRC_URI = " \
    file://70-persistent-net.rules \
"

do_install() {
    install -d ${D}/${sysconfdir}/udev/rules.d
    install -m 0644 ${WORKDIR}/70-persistent-net.rules ${D}/${sysconfdir}/udev/rules.d/
}

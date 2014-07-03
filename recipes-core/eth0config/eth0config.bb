SECTION = "core"
DESCRIPTION = "Predefined network config"
RDEPENDS_${PN} = ""
# The license is meant for this recipe and the files it installs.
# RNDIS is part of the kernel, udhcpd is part of busybox
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r1"

PACKAGE_ARCH = "all"

SRC_URI = " \
    file://settings.substitute \
"

do_install() {
    install -d ${D}/${localstatedir}/lib/connman/ethernet_00142d27364f_cable
    install -m 0774 ${WORKDIR}/settings.substitute ${D}/${localstatedir}/lib/connman/ethernet_00142d27364f_cable
}

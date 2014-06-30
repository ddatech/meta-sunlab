SECTION = "frameworks"
DESCRIPTION = "jquery plugin"
RDEPENDS_${PN} = ""
# The license is meant for this recipe and the files it installs.
# RNDIS is part of the kernel, udhcpd is part of busybox
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r1"

PACKAGE_ARCH = "all"

SRC_URI = "http://code.jquery.com/jquery-${PV}.min.js \
	"

do_install() {
    install -d ${D}/${sysconfdir}/udev/rules.d
    install -m 0644 ${WORKDIR}/hdmi.rules ${D}/${sysconfdir}/udev/rules.d/
}

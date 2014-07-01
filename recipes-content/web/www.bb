SECTION = "web"
DESCRIPTION = "webserver management content"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"
PR = "r1"

PACKAGE_ARCH = "all"

SRC_URI = " \
    file://index.html \
"

do_populate_sysroot() {
    install -d ${D}/${localstatedir}/www
    install -m 0755 ${WORKDIR}/index.html ${D}/${localstatedir}/www
}
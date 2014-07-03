SECTION = "web"
DESCRIPTION = "webserver management content"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"
PR = "r1"

PACKAGE_ARCH = "all"

SRC_URI = " \
    file://bootstrap_layout.zip \
"

do_install() {
    # creation of directory at destination
    install -d ${D}/${localstatedir}/www/cherokee
    install -m 0744 ${WORKDIR}/*.html ${D}/${localstatedir}/www/cherokee
    cp -r ${WORKDIR}/library ${D}/${localstatedir}/www/cherokee/library

}

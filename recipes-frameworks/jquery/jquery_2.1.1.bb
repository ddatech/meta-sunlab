# jQuery plugin

DESCRIPTION = "jquery plugin"
SUMMARY = "jQuery plugin to use in combination with bootstrap"
HOMEPAGE = "http://jquery.com/"
SECTION = "frameworks"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PACKAGE_ARCH = "all"

SRC_URI[md5sum] = "e40ec2161fe7993196f23c8a07346306"
SRC_URI[sha256sum] = "874706b2b1311a0719b5267f7d1cf803057e367e94ae1ff7bf78c5450d30f5d4"

SRC_URI = "http://code.jquery.com/jquery-${PV}.min.js"

do_install() {
    install -d ${D}/${localstatedir}/www/cherokee/js
    install -m 0775 ${WORKDIR}/jquery-${PV}.min.js ${D}/${localstatedir}/www/cherokee/js
}

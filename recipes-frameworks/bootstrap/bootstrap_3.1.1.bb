# use a customized front-end framework for web applications

DESCRIPTION = "Bootstrap is an HTML, CSS, and JS framework for developing responsive, mobile first projects on the web."
SUMMARY = "Bootstrap framework"
HOMEPAGE = "http://getbootstrap.com/"
SECTION = "net"
LICENSE = "Apache-2.0"

PACKAGE_ARCH = "all"

SRC_URI[md5sum] = "6280e447a777c90440fbdca7c504fd9c"
SRC_URI[sha256sum] = "77d72e99f947113cd55149900a736bd2c2cbec175ace6dd33c1b3d3fc51cbf81"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "file://bootstrap-${PV}-dist.zip \
	   file://LICENSE \
           \
"

LIC_FILES_CHKSUM = "file://../LICENSE;md5=4f068b5632f52fc355c5b93b75a82954"


do_install () {
   
    install -d "${D}${localstatedir}/www/cherokee/css"
    install -d "${D}${localstatedir}/www/cherokee/js"
    install -d "${D}${localstatedir}/www/cherokee/fonts"
   
    install -m 0744 -d ${D}${localstatedir}/www/cherokee/css
    install -m 0744 ${WORKDIR}/bootstrap-${PV}-dist/css/* ${D}${localstatedir}/www/cherokee/css
    install -m 0744 -d ${D}${localstatedir}/www/cherokee/js
    install -m 0744 ${WORKDIR}/bootstrap-${PV}-dist/js/* ${D}${localstatedir}/www/cherokee/js
    install -m 0744 -d ${D}${localstatedir}/www/cherokee/fonts
    install -m 0744 ${WORKDIR}/bootstrap-${PV}-dist/fonts/* ${D}${localstatedir}/www/cherokee/fonts

}

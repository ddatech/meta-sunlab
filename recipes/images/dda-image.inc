#additional packages to include in our Toradex images

# Copy Licenses to image /usr/share/common-licenses, on tegra with individual licenses
COPY_LIC_MANIFEST = "1"
COPY_LIC_DIRS_tegra = "1"

IMAGE_INSTALL_T20_T30 = " \
    eth0config \
    setstatic \
" 
IMAGE_INSTALL_MACHINE_colibri-t20 = " \
"

IMAGE_INSTALL_MACHINE_colibri-t30 = " \
"

IMAGE_INSTALL_MACHINE_apalis-t30 = " \
    ${IMAGE_INSTALL_T20_T30} \
    \
"

IMAGE_INSTALL_MACHINE_colibri-vf = " \
"

IMAGE_INSTALL_MACHINE = ""

IMAGE_INSTALL += " \
    ${IMAGE_INSTALL_MACHINE} \
    \
"
do_rootfs_prepend () {
    export NATIVE_ROOT=${STAGING_DIR_NATIVE}
}

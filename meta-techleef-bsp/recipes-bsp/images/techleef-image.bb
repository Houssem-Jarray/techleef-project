SUMMARY = "Techleef minimal image for Raspberry Pi 4"
DESCRIPTION = "A small image with basic networking, SSH access, and system tools for Raspberry Pi 4."
LICENSE = "MIT"

inherit core-image

IMAGE_LINGUAS = "en-us"

# The base packages for a minimal bootable system
IMAGE_INSTALL = "\
    packagegroup-core-boot \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    dropbear \
    bash \
    less \
    iproute2 \
    net-tools \
"

PROVIDES = "techleef-image"

# Disable recommended packages for smaller image size
IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_FEATURES += "package-management"

# Root filesystem size adjustments (optional)
IMAGE_ROOTFS_SIZE ?= "8192"

# Ensure we use your distro + machine
COMPATIBLE_MACHINE = "rpi4b"

SUMMARY = "Python library to scan local network for services and devices. "
HOMEPAGE = "https://github.com/home-assistant/netdisco"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://setup.py;md5=058427b11411bdccc5607100f7f796a0"

RDEPENDS_${PN} += "${PYTHON_PN}-netifaces ${PYTHON_PN}-zeroconf"
SRC_URI[md5sum] = "f51c3e8f428012ff2a84e75fa17474d8"
SRC_URI[sha256sum] = "0f9fb80b0deb122a5d3f0ae21813c96892bf8439ec0c9da57effecc055f724f1"

inherit pypi setuptools3

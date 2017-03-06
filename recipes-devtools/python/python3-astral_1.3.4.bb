SUMMARY = "Calculations for the position of the sun and moon."
HOMEPAGE = "https://pypi.python.org/pypi/astral/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3504d672db73bec8465bdb67542a50b5"

SRC_URI =" https://pypi.python.org/packages/83/6c/3a42194dce80c0bd7c391feeaa07e01ddcf9c3b99a0b54b8e5947858e9f7/astral-1.3.4.zip"

S = "${WORKDIR}/astral-${PV}"

SRC_URI[md5sum] = "b1b5738b4237bf9e8813f1f2ffd64452"
SRC_URI[sha256sum] = "e4bbd7748835cd76809ec06852c2a0afd44ecbb1873351a31f0dbb78f44f2de3"

DEPENDS += " python3-pytz-native"
inherit setuptools3

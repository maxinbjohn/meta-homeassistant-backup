SUMMARY = "Invoke py.test as distutils command with dependency resolution"
HOMEPAGE = "https://pypi.python.org/pypi/pytest-runner/2.11.1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e38b971c2b4c33b978d1b9c9ece9ae63"

SRC_URI[md5sum] = "bdb73eb18eca2727944a2dcf963c5a81"
SRC_URI[sha256sum] = "983a31eab45e375240e250161a556163bc8d250edaba97960909338c273a89b3"

inherit pypi setuptools3

DEPENDS += "python3-setuptools-scm-native"
BBCLASSEXTEND = "native nativesdk"

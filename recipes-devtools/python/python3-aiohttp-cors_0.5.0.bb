SUMMARY = "CORS support for aiohttp"
HOMEPAGE = "https://pypi.python.org/pypi/aiohttp-cors"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc"

SRC_URI[md5sum] = "467d42f38da97b05e37eea72165bbc38"
SRC_URI[sha256sum] = "09a336dccabfe52531cf8974c89afd2b837fc71e32c438d37a75e3e5f60122a3"

SRCREV = "0461e0c71918f80761785c376b876b913caddc31"
SRC_URI = "git://github.com/aio-libs/aiohttp-cors.git"
S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS_${PN} += "\
   ${PYTHON_PN}-aiohttp \
   ${PYTHON_PN}-typing \
   "

BBCLASSEXTEND = "native nativesdk"

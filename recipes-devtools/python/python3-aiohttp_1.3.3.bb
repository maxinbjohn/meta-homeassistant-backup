SUMMARY = "http client/server for asyncio"
HOMEPAGE = "https://pypi.python.org/pypi/aiohttp"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d4ae7def6b740abc020a2700493fef4e"

SRC_URI[md5sum] = "880e6744e7d125331467b8d3e2637392"
SRC_URI[sha256sum] = "103433f594442b98ed4af9db02331e548a0ef2d4cfd02207ea24ed9eb85862e4"

inherit pypi setuptools3

RDEPENDS_${PN} += "\
   ${PYTHON_PN}-chardet \
   "

BBCLASSEXTEND = "native nativesdk"

SUMMARY = "Timeout context manager for asyncio programs"
HOMEPAGE = "https://github.com/aio-libs/async-timeout"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI[md5sum] = "f8baef770792f04fa3d74e7d083c43e9"
SRC_URI[sha256sum] = "c7afd7355b93fca0aecc15811aa53eea57f6fd7307b5bff2336b01419ebeda36"

SRCREV = "04fa5bdde1068fd470f176f654cbada9b198397f"
SRC_URI = "git://github.com/aio-libs/async-timeout.git"
S = "${WORKDIR}/git"

PYPI_PACKAGE = "async_timeout"
inherit setuptools3

DEPENDS += "python3-pytest-runner-native"
RDEPENDS_${PN} += "python3-pytest"
BBCLASSEXTEND = "native nativesdk"

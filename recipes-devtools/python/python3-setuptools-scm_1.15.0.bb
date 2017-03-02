SUMMARY = "the blessed package to manage your versions by scm tags"
HOMEPAGE = "https://pypi.python.org/pypi/setuptools_scm"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=838c366f69b72c5df05c96dff79b35f2"

SRC_URI[md5sum] = "b6916c78ed6253d6602444fad4279c5b"
SRC_URI[sha256sum] = "daf12d05aa2155a46aa357453757ffdc47d87f839e62114f042bceac6a619e2f"

PYPI_PACKAGE = "setuptools_scm"
inherit pypi setuptools3

BBCLASSEXTEND = "native nativesdk"

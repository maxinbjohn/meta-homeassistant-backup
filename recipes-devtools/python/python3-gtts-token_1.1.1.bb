SUMMARY = "Calculates a token to run the Google Translate text to speech"
HOMEPAGE = "https://github.com/boudewijn26/gTTS-token"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=1f9f9536026538980bdaf2e7cef3b4ca"

SRC_URI ="https://pypi.python.org/packages/4c/c8/dd58eba1464729095217d3acfc4f6581348c6f495ea3342ed7dbc9f9e133/gTTS-token-1.1.1.zip"
S = "${WORKDIR}/gTTS-token-${PV}"

SRC_URI[md5sum] = "39f56680d81c3d553ccc663f013a48f8"
SRC_URI[sha256sum] = "74badf3ba37773d8ba4a462a09b64de76a0ebd4015d667a6fdb041c2219283ef"

inherit setuptools3

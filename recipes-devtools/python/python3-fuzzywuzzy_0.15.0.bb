SUMMARY = "Fuzzy string matching in python"
HOMEPAGE = "https://github.com/seatgeek/fuzzywuzzy"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9eea716ad75a54962b0802f278da3ccb"

RDEPENDS_${PN} += "${PYTHON_PN}-difflib"

SRC_URI[md5sum] = "97cbc62d3c4c220b7c566a0e72ef651e"
SRC_URI[sha256sum] = "5b36957ccf836e700f4468324fa80ba208990385392e217be077d5cd738ae602"

inherit pypi setuptools3

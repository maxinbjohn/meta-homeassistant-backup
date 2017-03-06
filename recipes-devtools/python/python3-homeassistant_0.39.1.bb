SUMMARY = "Home Assistant is an open-source home automation platform"
HOMEPAGE = "https://home-assistant.io/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://homeassistant/const.py;md5=f45c22f4167d2a681a90c5543fbbefc7"

SRC_URI[md5sum] = "49c6d759bdb90f3c3e2ec3d40c85ec44"
SRC_URI[sha256sum] = "bcfde3ab2dbc1cf8217168986d2a6c7810d545ba2a7212a6d8082bf6c59e380c"

inherit pypi setuptools3

SRC_URI += " file://0001-homeassistant-remove-typing-dependency.patch"

BBCLASSEXTEND = "native nativesdk"

RDEPENDS_${PN} += "\
    ${PYTHON_PN}-pip \
    ${PYTHON_PN}-setuptools \
    ${PYTHON_PN}-distutils \
    ${PYTHON_PN}-argparse \
    ${PYTHON_PN}-async-timeout \
    ${PYTHON_PN}-aiohttp \
    ${PYTHON_PN}-aiohttp-cors \
    ${PYTHON_PN}-typing \
    ${PYTHON_PN}-modules \
    ${PYTHON_PN}-sqlite3 \
    ${PYTHON_PN}-pyyaml \
    ${PYTHON_PN}-pytz \
    ${PYTHON_PN}-jinja2 \
    ${PYTHON_PN}-requests \
    ${PYTHON_PN}-voluptuous \
    ${PYTHON_PN}-multidict \
    ${PYTHON_PN}-yarl \
    ${PYTHON_PN}-sqlalchemy \
    ${PYTHON_PN}-fuzzywuzzy \
    ${PYTHON_PN}-netdisco \
    ${PYTHON_PN}-xmltodict \
    ${PYTHON_PN}-distro \
    ${PYTHON_PN}-astral \
    ${PYTHON_PN}-mutagen \
    ${PYTHON_PN}-gtts-token \
    "

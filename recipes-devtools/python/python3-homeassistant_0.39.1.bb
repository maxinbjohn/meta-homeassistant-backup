SUMMARY = "Home Assistant is an open-source home automation platform"
HOMEPAGE = "https://home-assistant.io/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://homeassistant/const.py;md5=f45c22f4167d2a681a90c5543fbbefc7"

SRC_URI[md5sum] = "49c6d759bdb90f3c3e2ec3d40c85ec44"
SRC_URI[sha256sum] = "bcfde3ab2dbc1cf8217168986d2a6c7810d545ba2a7212a6d8082bf6c59e380c"

inherit pypi setuptools3 update-rc.d systemd

SRC_URI += " file://0001-homeassistant-remove-typing-dependency.patch \
             file://hass-daemon \
             file://hass.service \
           "
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
INITSCRIPT_NAME = "hass"
INITSCRIPT_PARAMS = "start 90 2 3 4 5 . stop 60 0 1 6 ."

SYSTEMD_SERVICE_${PN} = "hass.service"

do_install_append () {
    install -d ${D}${sysconfdir}/init.d/
    install -d ${D}/var/opt/homeassistant/
    install -m 0755 ${WORKDIR}/hass-daemon ${D}${sysconfdir}/init.d/hass

    # install systemd unit files
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/hass.service ${D}${systemd_unitdir}/system
}

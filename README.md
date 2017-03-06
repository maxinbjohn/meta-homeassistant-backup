# meta-homeassistant
Layer to support "Home Assistant" - An open-source home automation platform running on Python 3

This layer provides OpenEmbedded metadata for [Home Assistant](https://home-assistant.io/)

# Getting Started

```shell

git clone git://github.com/openembedded/openembedded-core.git
cd openembedded-core
git clone git://github.com/openembedded/meta-openembedded.git
git clone git://github.com/openembedded/bitbake.git
git clone git://github.com/maxinbjohn/meta-homeassistant

$ . ./oe-init-build-env

$ bitbake-layers add-layer ../meta-openembedded/meta-oe
$ bitbake-layers add-layer ../meta-openembedded/meta-python
$ bitbake-layers add-layer ../meta-homeassistant
```

# Building

Below we build for qemux86-64 machine as an example, to add
homeassistant recipe to an image, ie:
in "conf/local.conf" add

```shell
IMAGE_INSTALL_append = " python3-homeassistant epiphany"

$ MACHINE=qemux86-64 bitbake core-image-sato
```
# Running

```shell

$ runqemu qemux86-64 core-image-sato

```

# Limitations

Works with OE Release >= 2.2


# Dependencies

```
URI: git://github.com/openembedded/openembedded-core.git
branch: master
revision: HEAD

URI: git://github.com/openembedded/meta-openembedded.git
branch: master
revision: HEAD

URI: git://github.com/openembedded/bitbake.git
branch: master
revision: HEAD

```

# Upstreaming

## Forking via github

You are encouraged to fork the mirror on [github](https://github.com/maxinbjohn/meta-homeassistant/)
to share your patches.

Maintainer(s)

* Maxin B. John <mailto:maxin.john@gmail.com>

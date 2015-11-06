DESCRIPTION = "node-webrtc"
HOMEPAGE = "http://js-platform.github.io/node-webrtc"

INC_PR = "r0"
PR = "${INC_PR}.0"

PROVIDES = ""
RPROVIDES_${PN} = ""

SRC_URI = "https://github.com/js-platform/node-webrtc;releases=0.0.59"

PV ="0.0.59"

#S = "${WORKDIR}/node-webrtc-v${PV}"
S = "${WORKDIR}/git"

# v8 errors out if you have set CCACHE
CCACHE = ""



DESCRIPTION = "simple Hello World program"
PR = "r0"
DEPENDS = ""
S = "${WORKDIR}"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${WORKDIR}/../../../../../../meta-recipes/LICENSE;md5=2c1c00f9d3ed9e24fa69b932b7e7aff2"

S = "${WORKDIR}"

SRC_URI = "file://${WORKDIR}/../../../../../../meta-hello/*/*/heybuddy.tar.gz"


do_install() {

	install -d -m 0755 ${D}${bindir}/
	cp -ar */bin/* ${D}${bindir}/
}

#FILES_${PN} = "${bindir}/hello_world"


INSANE_SKIP_${PN} = "already-stripped"

PARALLEL_MAKE = ""

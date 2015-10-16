# Demo
Raspberry Pi
Step 1:
Inside your Poky folder git clone this repository by mentioned command.
command : "git clone https://github.com/krunalsoni01/meta-recipes.git"

Step 2:
When you are in poky directory source the "oe-init-env" by below mentioned command and by sourcing you will be inside "build" directory
command : "source oe-init-build-env"    OR   ". oe-init-build-env"

Step 3:
Now go to "/conf/bblayer.conf" file and add layer as  mentioned below and save the file.
BBLAYERS ?= " \
  /home/rdkc-krunal/project/yocto/poky/meta \
  /home/rdkc-krunal/project/yocto/poky/meta-yocto \
  /home/rdkc-krunal/project/yocto/poky/meta-yocto-bsp \
  /home/rdkc-krunal/project/yocto/poky/meta-raspberrypi \
  /home/rdkc-krunal/project/yocto/poky/meta-recipes/meta-hello \
  
Step 4:
Now give the command to start building image
Command : "bitbake rpi-basic-image"

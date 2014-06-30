#!bin/bash
cd /usr/lib/connman/test/
./set-ipv4-method ethernet_00142d27364f_cable manual 192.168.20.206 255.255.255.0 192.168.20.10
./set-nameservers ethernet_00142d27364f_cable 192.168.20.1 192.168.10.2 8.8.8.8
cd ~

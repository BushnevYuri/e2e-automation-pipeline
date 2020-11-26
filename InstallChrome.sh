#!/bin/bash
set -ex
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo apt update && sudo apt-get update
sudo apt install ./google-chrome-stable_current_amd64.deb -y

# -*- mode: ruby -*-
# vi: set ft=ruby :

# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "hashicorp/precise32"

  config.vm.provision :shell, :inline => "apt-get update && apt-get install openjdk-7-jdk curl git tmux vim htop -y"
  config.vm.provision :shell, :inline => "wget https://raw.github.com/technomancy/leiningen/stable/bin/lein -O /usr/bin/lein"
  config.vm.provision :shell, :inline => "chmod +x /usr/bin/lein"

  config.vm.network :forwarded_port, host: 3000, guest: 3030
  config.vm.network "private_network", ip: "192.168.50.30"
end


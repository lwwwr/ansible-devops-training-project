# ansible-devops-training-project

Не забываем, что инвентори динамический

### ./ec2.py --list --profile *профиль* > amazon.txt

Не забываем настроить креды под амазон и профили для кредов

___

Дальше лучше.

## Ну-с, сначала надо поставить везде пакет пэкеджей и метрик

AWS_PROFILE=*профиль* ansible-playbook -i ec2.py setup_env.yml --extra-vars "target=*таргет_группа_со_всеми_тачками*"

### AWS_PROFILE=ansible ansible-playbook -i ec2.py setup_env.yml --extra-vars "target=all"

## Дальше раскатываем плейбуки на нужные инстансы

### AWS_PROFILE=*профиль* ansible-playbook -i ec2.py *роль*.yml --extra-vars "target=*таргет_группа*"

## Роли (по названию должно быть все понятно)

#### setup_env.yml 

#### install_jenkins.yml

#### install_alertmanaget.yml

#### install_docker.yml

#### install_instance_node_exporter.yml

#### install_nexus.yml

#### install_nexus_prometheus_exporter.yml

#### install_prometheus.yml

#### install_sonarquce.yml

# Не забываем редактировать темплейты на каждую тачку

##### AWS_PROFILE=ansible ansible-playbook -i ec2.py setup_env.yml --extra-vars "target=all"

##### AWS_PROFILE=ansible ansible-playbook -i ec2.py install_docker.yml --extra-vars "target=all"

##### AWS_PROFILE=ansible ansible-playbook -i ec2.py install_instance_node_exporter.yml --extra-vars "target=all"

##### AWS_PROFILE=ansible ansible-playbook -i ec2.py install_jenkins.yml --extra-vars "target=tag_Name_alavruschik_jenkins"

##### AWS_PROFILE=ansible ansible-playbook -i ec2.py install_sonarcube.yml --extra-vars "target=tag_Name_alavruschik_sonar_qube_nexus"

##### AWS_PROFILE=ansible ansible-playbook -i ec2.py install_nexus.yml --extra-vars "target=tag_Name_alavruschik_sonar_qube_nexus"

##### AWS_PROFILE=ansible ansible-playbook -i ec2.py install_prometheus.yml --extra-vars "target=tag_Name_alavruschik_prometheus_grafana_alertmanager"

##### AWS_PROFILE=ansible ansible-playbook -i ec2.py install_alertmanager.yml --extra-vars "target=tag_Name_alavruschik_prometheus_grafana_alertmanager"

##### AWS_PROFILE=ansible ansible-playbook -i ec2.py install_grafana.yml --extra-vars "target=tag_Name_alavruschik_prometheus_grafana_alertmanager"

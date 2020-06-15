# ansible-devops-training-project

Не забываем, что инвентори динамический

### ./ec2.py --list --profile *профиль* > amazon.txt

Не забываем настроить креды под амазон и профили для кредов

___

Дальше лучше.

## Ну-с, сначала надо поставить везде пакет пэкеджей

AWS_PROFILE=*профиль* ansible-playbook -i ec2.py setup_env.yml --extra-vars "target=*таргет_группа_со_всеми_тачками*"

## Добавляем убунту-юзика в судоеры на всякий случай

###AWS_PROFILE=*профиль* ansible-playbook -i ec2.py initial_user_setup.yml --extra-vars "target=ТАРГЕТ_ГРУППА"  
Не забудем, что у нас плейбуки заточены тупо под амазоновские амишки с убунтой, где юзик *ubuntu*

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



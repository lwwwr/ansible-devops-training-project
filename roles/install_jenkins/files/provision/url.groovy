#!groovy

import jenkins.model.JenkinsLocationConfiguration

jlc = JenkinsLocationConfiguration.get()
jlc.setUrl("https://jenkins.alavr.test.coherentprojects.net/")
println(jlc.getUrl())
jlc.save()


pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('islamic-resource-finder-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/hyder-khan/islamic-resource-finder.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
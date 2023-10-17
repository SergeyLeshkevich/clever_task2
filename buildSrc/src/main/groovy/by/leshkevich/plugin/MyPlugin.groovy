package by.leshkevich.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin;
import org.gradle.api.Project;

class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        def map = [description: "Task one", group: "myPlugin", type: DefaultTask]
        project.task(map,"one") {
            doLast {
                println "action 1 task one"
            }

            doLast {
                println "action 3 task one"
            }

            doFirst {
                println "action 2 task one"
            }
        }

        project.task(map,"two") {
            doLast {
                println "action 1 task two"
            }

            doLast {
                println "action 3 task two"
            }

            doFirst {
                println "action 2 task two"
            }
        }
    }
}

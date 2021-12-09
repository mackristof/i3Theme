package com.github.mackristof.i3theme.services

import com.intellij.openapi.project.Project
import com.github.mackristof.i3theme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

package com.github.gaoliang.jsontoolbox.services

import com.github.gaoliang.jsontoolbox.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

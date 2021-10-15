package com.github.ken437.pythonify3.services

import com.intellij.openapi.project.Project
import com.github.ken437.pythonify3.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

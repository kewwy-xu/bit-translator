package com.github.kewwyxu.bittranslator.services

import com.intellij.openapi.project.Project
import com.github.kewwyxu.bittranslator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

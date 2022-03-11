package com.github.alixm.sims4hash.services

import com.intellij.openapi.project.Project
import com.github.alixm.sims4hash.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

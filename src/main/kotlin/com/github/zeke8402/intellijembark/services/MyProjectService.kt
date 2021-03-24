package com.github.zeke8402.intellijembark.services

import com.github.zeke8402.intellijembark.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}

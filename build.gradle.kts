/*
 * Red Innovation © 2024.
 *
 * This file (hereafter, the "work") is licensed under the European Union
 * Public Licence, Version 1.2 or later (the "EUPL"). This EUPL applies to this
 * work, which is provided under the terms of this EUPL. You may obtain a copy
 * of this EUPL at:
 *
 *     https://joinup.ec.europa.eu/collection/eupl/eupl-text-eupl-12
 *
 * Any use of this work, other than as authorised under this EUPL, is
 * prohibited (to the extent such use is covered by a right of the copyright
 * holder of this work).
 *
 * Author: Mauko Quiroga-Alvarado <mauko@redte.ch>.
 */

group = "ch.redte.retrieve"
version = "0.0.0"

plugins {
    id("org.gradle.application")
    id("org.jetbrains.kotlin.jvm") version("2.0.20")
    id("org.graalvm.buildtools.native") version("0.10.3")
}

application {
    mainClass = "ch.redte.retrieve.parsers.MainKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.tika:tika-parsers:3.0.0-BETA")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

graalvmNative {
    binaries {
        all {
            imageName = "retrieve-parsers"
            resources.autodetect()
        }
    }

    metadataRepository {
        enabled = true
    }
}

tasks {
    test {
        useJUnitPlatform()
    }
}

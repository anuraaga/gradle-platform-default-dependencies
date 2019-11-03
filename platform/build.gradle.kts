plugins {
  `java-platform`
}

dependencies {
  constraints {
    api("org.jacoco:org.jacoco.agent:0.8.5")
    api("org.jacoco:org.jacoco.ant:0.8.5")
  }
}


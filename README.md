Stratomine's Bukkit plugin [Maven archetype](http://maven.apache.org/guides/introduction/introduction-to-archetypes.html) will help you get a plugin project off the ground.

### Versions

This archetype is versioned in unison with Bukkit, so it's easy to specify which Bukkit release you'd like to build your plugin against.

Version numbers look like this: `0.0.1-r855-1.0.0`

* `0.0.1` -- Bukkit's release version.
* `r855` -- Bukkit's build number.
* `1.0.0` -- This archetype's release version, *relative to the Bukkit version.*

The archetype's release version resets with each new Bukkit release. Bukkit 0.0.1-r855 may see several related bukkit-plugin-archetype releases -- say, to bukkit-plugin-archetype 0.0.1-r855-1.0.3. When the archetype is updated to the next Bukkit release, however, the archetype's release version will reset to 1.0.0. For example, the next version might be bukkit-plugin-archetype 0.0.1-r856-1.0.0.

### Usage

To create a new Bukkit plugin project, use a command like the following:

    mvn archetype:generate \
        -DinteractiveMode=false \
        -DarchetypeRepository=http://maven.stratomine.com/release \
        -DarchetypeGroupId=com.stratomine.archetypes \
        -DarchetypeArtifactId=bukkit-plugin-archetype \
        -DarchetypeVersion=0.0.1-r855-1.0.0 \
        -DgroupId=com.stratomine.bukkit.plugins \
        -DartifactId=bukkit-plugin \
        -Dname=Plugin

You should customize the following properties:

* `archetypeVersion` -- Corresponds with the Bukkit release to build against. (For example, `0.0.1-r855-1.0.0`.)
* `groupId` -- Your plugin's artifact group. (Often the same as its Java package.)
* `artifactId` -- Your plugin's project name.
* `name` -- Your plugin's CamelCase friendly name. (This is used to name Java classes.)

You may also specify these optional properties:

* `version` -- Your plugin's version. (Default: `0.0.1-SNAPSHOT`)
* `package` -- Your plugin's Java package. (Default: the value of `groupId`)

Alternatively, you may leave out `-DinteractiveMode=false` and let Maven prompt you for values.

Stratomine's Maven repository also hosts an [archetype catalog](http://maven.apache.org/archetype/maven-archetype-plugin/specification/archetype-catalog.html). If you use [m2eclipse](http://eclipse.org/m2e/) or a similar tool, you may point it at `http://maven.stratomine.com/release/archetype-catalog.xml` to further streamline your workflow!

#### What's Created

Your new project will have a tree similar to the following:

    bukkit-foo/
       pom.xml
       src/
         main/
           java/.../
             FooPlugin.java
           resources/
             plugin.yml
         test/
           java/.../
             FooPluginTest.java

* `pom.xml` -- Your plugin's [Project Object Model](http://maven.apache.org/pom.html).
* `FooPlugin.java` -- Your plugin's main class.
* `FooPluginTest.java` -- A [JUnit](http://junit.org/) test case ready to test your main class.
* `plugin.yml` -- A Bukkit [plugin descriptor file](http://wiki.bukkit.org/Plugin_YAML) for your plugin.

You should add a description and URL to `pom.xml`, and customize `plugin.yml` to suit your project.

### Updates

To deploy a new version of the archetype, follow these steps:

1. Update the **Bukkit dependency version** in `src/main/resources/archetype-resources/pom.xml`. This is often the latest [recommended build](http://ci.bukkit.org/job/dev-Bukkit/promotion/latest/Recommended/). Specify the version like `0.0.1-r855`.
2. Update the **archetype version** in the archetype's `pom.xml`. It should correspond with the Bukkit dependency version, and add an archetype release version, like `0.0.1-r855-1.0.0`.
3. Commit your changes: `git commit -m "bukkit-plugin-archetype 0.0.1-r855-1.0.0"`
4. Tag your commit: `git tag v0.0.1-r855-1.0.0`
5. Push your changes to GitHub. (Don't forget to push the tag as well!)
6. Deploy the new archetype version to http://maven.stratomine.com/ using `mvn deploy`.

### License

(The MIT license)

Copyright (c) 2011 Stratomine

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Stratomine's Bukkit plugin [Maven archetype](http://maven.apache.org/guides/introduction/introduction-to-archetypes.html) will help you get a plugin project off the ground.

This archetype is versioned in unison with Bukkit, so it is easy to specify which Bukkit release you'd like to build your plugin against.

### Usage

To create a new Bukkit plugin project, use a command like the following:

    mvn archetype:generate \
        -DarchetypeGroupId=com.stratomine.archetypes \
        -DarchetypeArtifactId=bukkit-plugin-archetype \
        -DarchetypeVersion=0.0.1-r855 \
        -DgroupId=com.stratomine.bukkit.plugins \
        -DartifactId=bukkit-plugin

You should customize the following parameters:

* `archetypeVersion` -- Corresponds with the Bukkit release to build against.
* `groupId` -- Your plugin's package.
* `artifactId` -- Your plugin's name.

Stratomine projects are namespaced in `com.stratomine.bukkit.plugins`.

### License

(The MIT license)

Copyright (c) 2011 Stratomine

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

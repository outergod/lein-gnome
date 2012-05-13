# lein-gnome

Bringing the magic of ClojureScript to the desktop via Gnome Shell extensions.

## Usage

Put `[lein-gnome "0.1.0-SNAPSHOT"]` into the `:plugins` vector of your project.clj.

    $ lein new lein-gnome myextension example.com
    $ cd myextension/
    $ tree
    .
    ├── project.clj
    └── src
        ├── hello.cljs
        └── stylesheet.css
    1 directory, 3 files
    $ lein gnome compile
    [...]
    Compiling ClojureScript.
    Compiling "/tmp/myextension/target/extension/extension.js" from "src"...
    Successfully compiled "[...]/extension.js" in 6.107488105 seconds.
    Wrote extension: target/extension
    $ lein gnome install
    Copied extension to ~/.local/share/gnome-shell/extensions/myextension@example.com directory.
    Press Alt+F2 r ENTER to reload.

Coming soon: a repl.

## License

Copyright © 2012 Phil Hagelberg

Distributed under the Eclipse Public License, the same as Clojure.

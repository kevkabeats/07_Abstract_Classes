<!-- .github/copilot-instructions.md -->
# Repository guidance for AI coding agents

**Project Overview:**
- **Type:** Small Java exercise / learning project (no build system present).
- **Package root:** `com.cc.java` (source in `com/cc/java/`).
- **Primary file:** `com/cc/java/App.java` (empty `main` stub).
- **Diagram:** `shapes.drawio` indicates this repository exercises shape/abstract-class design.

**What to know up-front:**
- There is no `pom.xml`, `build.gradle`, or test harness. Keep changes minimal and self-contained.
- New Java sources must live under `com/cc/java/` and include `package com.cc.java;` at the top of the file.

**How to compile & run (Windows PowerShell):**
```powershell
# From repo root
javac -d out com\cc\java\*.java
java -cp out com.cc.java.App
```
- Use `-d out` to preserve package structure. The runtime classpath should include `out`.

**Coding conventions & patterns (observed):**
- One public class per file, file path matches package declaration (`com/cc/java/ClassName.java`).
- Minimalistic, educational style — prefer simple, explicit code over frameworks or build tools.
- When adding examples of abstract classes, follow names suggested by `shapes.drawio` (e.g., `Shape`, `Circle`, `Rectangle`) and place them under `com.cc.java`.

**When modifying `App.java` or adding exercises:**
- Keep `main` small: demonstrate usage via short, self-contained examples that can be compiled with the above commands.
- Avoid adding external libraries or build tool configs unless the user asks; prefer plain JDK usage.

**Examples to follow (concrete snippets):**
- Correct package header for a new class `Shape`:
```java
package com.cc.java;

public abstract class Shape {
    public abstract double area();
}
```
- Small `main` usage example inside `App.java`:
```java
package com.cc.java;

public class App {
    public static void main(String[] args) {
        Shape s = new Circle(1.0);
        System.out.println(s.area());
    }
}
```

**What NOT to do:**
- Do not assume a build system or CI exists. Don't add complex build files without asking.
- Don't introduce platform-specific or third-party dependencies without discussing with the repo owner.

**Key files/directories to reference:**
- `com/cc/java/` — source files and where to add new classes.
- `App.java` — exercise entrypoint and example runner.
- `shapes.drawio` — diagram describing intended class relationships.

If anything here is unclear or you want guidance on adding a sample `Shape` implementation, tell me which shape(s) you want and I will add them and update `App.java` with runnable examples.

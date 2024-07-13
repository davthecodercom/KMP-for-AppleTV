This is a Kotlin Multiplatform project targeting iOS and tvOS.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here too.

* `/shared/src/commonMain/kotlin` contains the shared code.
* `/shared/src/iosMain/kotlin` contains the iOS-specific code.
* `/shared/src/tvosMain/kotlin` contains the tvOS-specific code.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

## Running the project
- To run the project:
  > open the `iosApp` directory in Xcode 
  > Select TV simulator or real device, and run the project.

## Demo
![gif demo playing in tvOS](img/kmp-appletv.gif)

## Creator
I am a software engineer with a passion for mobile application development. I
have been working with Kotlin Multiplatform for a while now and I am excited about the future of this technology. 
I am always looking for ways to improve my skills and learn new things. I am open to collaboration and new opportunities.

- [David Cruz](https://github.com/davthecodercom)
- [Twitter](https://twitter.com/davthecoder)
- [LinkedIn](https://www.linkedin.com/in/davthecoder/)
- [Website](https://www.davthecoder.com)

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

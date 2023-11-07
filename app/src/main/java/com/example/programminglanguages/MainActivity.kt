package com.example.programminglanguages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.SearchView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var adpt : MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Programming Languages")
        val rcyle : RecyclerView = findViewById(R.id.cardView)
        rcyle.layoutManager = GridLayoutManager(this,2,GridLayoutManager.VERTICAL,
            false)

        val arr : ArrayList<OurData> = ArrayList()
        arr.add(OurData("Binary Code Programming","Binary programming language" +
                " is a type of programming language that uses a two-symbol system to represent text," +
                " computer processor instructions, or any other data",R.drawable.binary,"https://en.wikipedia.org/wiki/Binary_code"))
        arr.add(OurData("C++ Programming",
            "It is used for Competative programming and also for game development. ",
            R.drawable.cpp,"https://en.wikipedia.org/wiki/C++"))
        arr.add(OurData("Dart Programming",
            "Dart is a programming language designed by Lars Bak and Kasper Lund and " +
                    "developed by Google. It can be used to develop web and mobile apps as well as" +
                    " server and desktop applications.",
            R.drawable.dart,"https://en.wikipedia.org/wiki/Dart_(programming_language)"))
        arr.add(OurData("Flutter Programming",
            "Flutter is an open-source UI software development kit created by Google. " +
                    "It is used to develop cross platform applications from a " +
                    "single codebase for any web browser, Fuchsia, Android, iOS, Linux, macOS, and Windows.",
            R.drawable.flutter,"https://en.wikipedia.org/wiki/Flutter_(software)"))
        arr.add(OurData("html Programming",
            "The HyperText Markup Language or HTML is the standard markup language for " +
                    "documents designed to be displayed in a web browser. It defines the meaning and" +
                    " structure of web content. It is often assisted by technologies such as " +
                    "Cascading Style Sheets (CSS) and scripting languages such as JavaScript.",
            R.drawable.html,"https://en.wikipedia.org/wiki/HTML"))
        arr.add(OurData("Java Programming",
            "Java is a high-level, class-based, object-oriented programming language that " +
                    "is designed to have as few implementation dependencies as possible. It is a " +
                    "general-purpose programming language",
            R.drawable.java,"https://en.wikipedia.org/wiki/Java_(programming_language)"))
        arr.add(OurData("JavaScript Programming",
            "JavaScript is a high-level programming language that is one of the core " +
                    "technologies of the World Wide Web. It is used as a client-side programming " +
                    "language by 97.8 percent of all websites. JavaScript was originally used only " +
                    "to develop web browsers, but they are now used for server-side website " +
                    "deployments and non-web browser applications as well. ",
            R.drawable.javascript,"https://en.wikipedia.org/wiki/JavaScript"))
        arr.add(OurData("Kotlin Programming",
            "Kotlin is a general-purpose programming language originally developed and " +
                    "unveiled as Project Kotlin by JetBrains in 2011. The first version was " +
                    "officially released in 2016." +
                    " It is interoperable with Java and supports functional programming languages."
                    + "Kotlin is used extensively for Android apps, web application, desktop " +
                    "application, and server-side application development.",
            R.drawable.kotlin,"https://en.wikipedia.org/wiki/Kotlin_(programming_language)"))
        arr.add(OurData("nodeJS Programming",
            "Node.js is a cross-platform, open-source server environment that can run on " +
                    "Windows, Linux, Unix, macOS, and more. Node.js is a back-end JavaScript runtime" +
                    " environment, runs on the V8 JavaScript engine, and executes JavaScript code " +
                    "outside a web browser.",
            R.drawable.nodejs,"https://en.wikipedia.org/wiki/Node.js"))
        arr.add(OurData("php Programming",
            "PHP is an open-source programming language created in 1990. Many web " +
                    "developers find it essential to learn PHP, as this language is used to build " +
                    "more than 80% of websites on the Internet, including notable sites like " +
                    "Facebook and Yahoo.",
            R.drawable.php,"https://simple.wikipedia.org/wiki/PHP"))
        arr.add(OurData("Python Programming",
            "Python is one of the most popular programming languages today and is easy for" +
                    " beginners to learn because of its readability. It is a popular programming " +
                    "language for machine learning and deep learning applications. ",
            R.drawable.python,"https://en.wikipedia.org/wiki/Python_(programming_language)"))
        arr.add(OurData("React Programming","React programming is a " +
                "declarative programming paradigm that involves data streams and the propagation of " +
                "change. React programming is a declarative programming paradigm that involves data " +
                "streams and the propagation of change",R.drawable.react,"https://en.wikipedia.org/wiki/React_(JavaScript_library)"))
        arr.add(OurData("Ruby Programming","If you want to start with a " +
                "language that is known for being relatively simple to learn, consider Ruby. " +
                "Developed in the 1990s, it was designed to have a more human-friendly syntax while " +
                "still being flexible from the standpoint of its object-oriented architecture that " +
                "supports procedural and functional programming notation",R.drawable.ruby,"https://en.wikipedia.org/wiki/Ruby_(programming_language)"))
        arr.add(OurData("Typescript Programming","TypeScript is a newcomer to" +
                " top programming language lists, but it’s making headway. It was developed in 2012 " +
                "by Microsoft and is a typed version of JavaScript that is well suited for large " +
                "code bases. TypeScript is used to create JavaScript-based projects with typing in " +
                "both client-side and server-side development, making useful for catching errors and" +
                " preventing systemic issues",R.drawable.typescript,"https://en.wikipedia.org/wiki/TypeScript"))
        arr.add(OurData("MySQL","MySQL is a standard database query language. It" +
                " is used to access and manipulate data in databases. SQL is a declarative language " +
                "that specifies the desired results, but not the steps to achieve those results",
            R.drawable.mysql,"https://en.wikipedia.org/wiki/MySQL"))
        arr.add(OurData("Go Programming","Go was developed by Google in 2007 " +
                "for APIs and web applications. Go has recently become one of the fastest-growing " +
                "programming languages due to its simplicity, as well as its ability to handle " +
                "multicore and networked systems and massive codebases",R.drawable.img,"https://en.wikipedia.org/wiki/Go_(programming_language)"))
        arr.add(OurData("Rust Programming","Rust is a programming language " +
                "designed to be safe, concurrent, and practical. It is a systems programming " +
                "language that runs blazingly fast, prevents segfaults, and guarantees thread " +
                "safety. Rust is also memory-efficient: it uses minimal memory, making it ideal for " +
                "embedded systems.",R.drawable.img_1,"https://en.wikipedia.org/wiki/Rust_(programming_language)"))
        arr.add(OurData("Swift Programming","Swift is a high-level " +
                "general-purpose, multi-paradigm, compiled programming language developed by Apple " +
                "Inc. and the open-source community." +
                " Swift compiles to machine code, as it is an LLVM-based compiler.",R.drawable.swift,"https://en.wikipedia.org/wiki/Swift_(programming_language)"))



        adpt = MyAdapter(arr,this,arr.toMutableList())

        rcyle.adapter = adpt
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        val item = menu?.findItem(R.id.search_button)
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adpt.filter.filter(newText)
                return false
            }

        })
        return super.onCreateOptionsMenu(menu)
    }
}



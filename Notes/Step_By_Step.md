This is where I'm going to take my notes on a SpringBoot walkthrough as well as what terminology I need to understand and know how it works. I am going to be putting notes into the Definitions.md


Step One:
Spring Initializer (SI)

The SI is a tool that creates a jar file with the dependencies that allow us to build our APIs. It is a web framework. This framework is pretty powerful and comes with a lot of pre-built packages that are community sourced. 

For web apps, what I'm trained in, I need the Spring Web JPA and the Springboot Web. I can also add the database support as well. In my case I am most comfortable with PostgreSQL, so I would import that as well. 

After I have the proper dependencies I can open up in VSCode/Intellij (I prefer Intellij when working with Java projects now as it has less bugs than VSCode. Especially when dealing with nested packages.)

The pom.xml holds all of my dependencies in the project and initially I will need to comment out the Starter Data JPA as the program will not run without setting up the PostgreSQL info. 

Running the program starts it, usually, on port 8080. 

Step 2: 

Within the main folder of the Spring Jar I will find the DemoApplication java file. This is the file that starts the server. I don't have any further configuration to do here. I just start the server here. 

Within the same folder I should make the class packages. In this case I made the videogame folder. This folder will hold all of the related information regarding the model within. 

Step 3: 
The Class Model.

The constructor in this case is the videogame.java file. Within it we have generic public class of the model, videogame, and we make PRIVATE attributes regarding the model. The attributes we need are: 

LONG ID

Then whatever the heck else we want to define in the table. In my case I had the videogame name, poster, and achievements. 

After we set up the public attributes we need Getters, Setters, and Constructors. 

We make overloaded constructors first. These would be to cover a few bases when we develop the API. We make a default (empty), full (all attributes), and without an ID (the database will generate an ID automatically). 

Then we can make the getters/setters for the private attributes we made earlier. These are simple public string / void methods for the getter/setter respectively. 

Finally in our model class we can Override the built in toString method because we don't want the numeric location of the object we want the information within. This will have us return something along the lines of: 

        return "Videogame{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", poster='" + poster + '\'' +
                ", achievements=" + achievements +
                '}';
        }


Honestly didn't know I could put code blocks within a MD file.

STEP 4:

So hear me out, we have our model set up. Now we need to activate the controller for the method. 
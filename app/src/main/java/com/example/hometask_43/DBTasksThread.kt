package com.example.hometask_43

import android.util.Log

class DBTasksThread (name: String): Runnable {  //работа с базой данных в отдельном потоке

    init {
        Thread(this).start() //конструктор
    }

    override fun run() {
        var db = App.instance.database
        var tasksDao = db.tasksDao

        //insert

       /* var task =
            Tasks(1, "Hire new employee", "To check CVs on workUA", "11/10/2021", "Main", "Red")
        tasksDao.insert(task)

        var task1 =
            Tasks(2, "Buy paper", "To buy 5 boxes of paper", "01/10/2021", "Not Main", "Black")
        tasksDao.insert(task1)

        var task2 = Tasks(
            3,
            "Buy pencils and pens",
            "To buy 100 pencils and pens",
            "03/10/2021",
            "Not Main",
            "Black"
        )
        tasksDao.insert(task2)

        var task3 =
            Tasks(4, "Clean office", "To order a cleaning company", "01/10/2021", "Main", "Red")
        tasksDao.insert(task3)

        var task4 = Tasks(
            5,
            "Print documentation",
            "To print documentation from file Task.docx",
            "07/11/2021",
            "Not Main",
            "Black"
        )
        tasksDao.insert(task4)

        var task5 =
            Tasks(6, "Fix chairs", "To fix 2 broken chairs", "17/11/2021", "Not Main", "Black")
        tasksDao.insert(task5)

        var task6 =
            Tasks(7, "Buy coffee", "To buy 4 packages of coffee", "10/10/2021", "Not Main", "Black")
        tasksDao.insert(task6)

        var task7 = Tasks(
            8,
            "Fix coffee machine",
            "To order a company for fixing the coffee machine",
            "08/10/2021",
            "Not Main",
            "Black"
        )
        tasksDao.insert(task7)*/


        //delete
        /*var task5 =
            Tasks(6, "Fix chairs", "To fix 2 broken chairs", "17/11/2021", "Not Main", "Black")
        tasksDao.delete(task5)*/



        //update
        /*var task5 =
            Tasks(6, "Fix old chairs", "To fix 2 old broken chairs", "17/11/2021", "Not Main", "Black")
        tasksDao.update(task5)*/

        var tasks = tasksDao.allTasks
        Log.d("MyLog43", "Task Number: " + tasks[0].id.toString() + " | " + tasks[0].topic + " | " + tasks[0].description + " | End Date: " + tasks[0].timetodo + " | Status: " + tasks[0].status + " | " + tasks[0].color);
        Log.d("MyLog43", "Task Number: " + tasks[1].id.toString() + " | " + tasks[1].topic + " | " + tasks[1].description + " | End Date: " + tasks[1].timetodo + " | Status: " + tasks[1].status + " | " + tasks[1].color);
        Log.d("MyLog43", "Task Number: " + tasks[2].id.toString() + " | " + tasks[2].topic + " | " + tasks[2].description + " | End Date: " + tasks[2].timetodo + " | Status: " + tasks[2].status + " | " + tasks[2].color);
        Log.d("MyLog43", "Task Number: " + tasks[3].id.toString() + " | " + tasks[3].topic + " | " + tasks[3].description + " | End Date: " + tasks[3].timetodo + " | Status: " + tasks[3].status + " | " + tasks[3].color);
        Log.d("MyLog43", "Task Number: " + tasks[4].id.toString() + " | " + tasks[4].topic + " | " + tasks[4].description + " | End Date: " + tasks[4].timetodo + " | Status: " + tasks[4].status + " | " + tasks[4].color);
        Log.d("MyLog43", "Task Number: " + tasks[5].id.toString() + " | " + tasks[5].topic + " | " + tasks[5].description + " | End Date: " + tasks[5].timetodo + " | Status: " + tasks[5].status + " | " + tasks[5].color);
        Log.d("MyLog43", "Task Number: " + tasks[6].id.toString() + " | " + tasks[6].topic + " | " + tasks[6].description + " | End Date: " + tasks[6].timetodo + " | Status: " + tasks[6].status + " | " + tasks[6].color);
        Log.d("MyLog43", "Task Number: " + tasks[7].id.toString() + " | " + tasks[7].topic + " | " + tasks[7].description + " | End Date: " + tasks[7].timetodo + " | Status: " + tasks[7].status + " | " + tasks[7].color);



    }

}
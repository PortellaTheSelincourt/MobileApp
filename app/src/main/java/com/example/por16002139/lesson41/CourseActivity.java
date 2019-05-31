package com.example.por16002139.lesson41;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private DividerItemDecoration mDividerItemDecoration;
    private CourseAdapter mCourseAdapter;
    private List<Course> mCourses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.course_list);
        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.white));
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true);

        }

        mRecyclerView = findViewById(R.id.my_recycler_view);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);              // Construct a new layout manager for measuring and positioning the RecyclerView
        mRecyclerView.setLayoutManager(mLayoutManager);                                                 // Set the RecyclerView.LayoutManager that this RecyclerView will use
        mRecyclerView.setHasFixedSize(true);                                                            // RecyclerView to perform several optimisations in advance, as the RecyclerView's size is not affected by the adapter contents

        mRecyclerView.removeItemDecoration(mDividerItemDecoration);                                     // Remove an RecyclerView.ItemDecoration from this RecyclerView
        mDividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);// Create new DividerItemDecoration
        mRecyclerView.addItemDecoration(mDividerItemDecoration);                                        // Add the DividerItemDecoration to the RecyclerView

        for (int i = 0; i < 1; i++) {

            Course Course = new Course("Access (Database) – Level 1 CLAIT", "Part Time Qualification", "Databases are widely used tools in modern offices today and this course will enable you to learn substantial skills and provide efficient office support. This course is offered at two levels. Beginners: you will learn skills varying from table creation, use of queries, editing and inputting data into new and existing tables. Advanced: you will learn about formula creation within a query, how to produce reports and labels and format the design of them once produced." );
            Course Course1 = new Course("AAT (SAGE) Computerised Accounting Award Level 2" , "Part Time Qualification" , "If you already have manual bookkeeping knowledge, this course is designed to provide you with the basic skills necessary to input and interrogate information held on computerised accounting software." );
            Course Course2 = new Course("Animation " , "Part Time Love2Learn" , "This course offers an introductory guide to the animation process from storyboard to screen, taught by an industry professional. The focus will be on traditional 2D techniques which will also be applicable to 3D computer-generated animation. The course is suitable for beginners with an interest in illustration who want to apply their skills to animation, as well as those who want to know how animation is produced professionally." );
            Course Course3 = new Course("Asp.Net " , "Part Time Love2Learn" , "During this course you will learn how to construct complex websites in a Microsoft environment using ASP.NET in the C# programming language making full use of the MVC (model-view-controller) structure." );
            Course Course4 = new Course("Blended Learning, Teaching and Assessment Technology " , "Part Time Love2Learn" , "This course is about learning to make the most of  teaching and learning technologies so that strategic leaders, teachers and TLAs can enrich the traditional learning environment with 21st century teaching, learning and assessment tools.  Our experience is that busy staff rarely have the the time to keep pace with rapid changes in technology to independently develop necessary skills.  Schools could use this course to widen the existing learning environment, to develop staff technical knowledge that will complement existing pedagogic and curriculum knowledge, and to better prepare learners’ fundamental digital skills.  The potential for change includes innovative teaching and assessment practices, engaging a wider range of learners and increased learner involvement in tracking and assessment.  At the core of this course are lessons, skills and practices for Assessment For All and mapping Blooms Taxonomy to the digital learning environment." );
            Course Course5 = new Course("Computers for Work ", "Adult Community Learning" , "A 13-hour course (unsuitable for beginners) for people looking to improve their computer skills for paid employment, voluntary/charity work, social enterprise or self-employment. You will be supported by a tutor in small friendly group to: nbrush up and develop your word processing skills develop the basics of spreadsheets and business budgeting design and create PowerPoint slides" );
            Course Course6 = new Course("Create Your Own Android App on PC " , "Part Time Love2Learn" , "This Android course will teach you the basics on how to create your own Android app on a PC. Students will be supported through making their own app that will display pictures from a provided API before designing and creating an app of their own." );
            Course Course7 = new Course("Digital Art and Design " , "Part Time Love2Learn" , "Digital technology has become an essential tool for many artists and designers. This course is aimed at supporting artists and designers who wish to incorporate aspects of digital design in their work. Learn about specific programs such as Illustrator and Photoshop (part of Adobe reative Cloud) in our state-of-the-art Mac suites." );
            Course Course8 = new Course("Excel (Spreadsheets) – Level 1 CLAIT " , "Part Time Qualification" , "Excel spreadsheets are a widely used tool in offices and this course will enable you to learn substantial skills and provide efficient office support. You will cover the basics of inserting and formatting text and numbers within a spreadsheet format and the use of basic formula and chart creation. Attendance is flexible and can be arranged with your tutor on application. This course may also be available at our Somer Valley Campus. Please contact the Student Advice Centre or visit www.bathcollege.ac.uk to register your interest." );
            Course Course9 = new Course("Get Started with iPads " , "Adult Community Learning" , "Come and have fun and explore touch screen technology with a course designed especially for beginners. Learn how to: navigate the iPad with the swipe screen technique introduction to Applications – “Apps” explore the camera and video functions use and navigate the web feature to surf the internet become familiar with some of the terminology and jargon related to using an iPad" );
            Course Course10 = new Course("Introduction to 3D Games Development in Unity " , "Part Time Qualification" , "During this course you will learn how to develop a 3D game using the Unity game engine and the C# programming language. The techniques learnt on this course are transferable to all kinds of game development and other types of programming. Throughout this course you will create a simple 3D racing game. Games created using the Unity game engine are compatible with over 10 platforms including Android, iOS, PS4, Xbox One, PC, Mac, Linux and a wide selection of virtual reality headsets." );
            Course Course11 = new Course("Introduction to Linux " , "Part Time Qualification" , "Linux powers 94% of the world’s supercomputers, most of the servers powering the Internet, the majority of financial trades worldwide and a billion Android devices. During this course you will learn how to install, maintain and use a Linux system. You will develop a working knowledge of Linux using both the graphical interface and command line." );
            Course Course12 = new Course("Microsoft Excel" , "Part Time Qualification" , "This free 5-hour workshop will be run in a small, friendly, tutor-led group and is suitable for anyone looking to improve their speadsheet skills – not suitable for beginners. Microsoft Excel is widely used in all types of businesses and is excellent for organising and sorting data as well as business planning and performing calculations. During the workshop you will learn: entering and editing data formatting cells and worksheets using basic formulas and functions creating, editing and formatting charts sorting and filtering" );
            Course Course13 = new Course("Microsoft PowerPoint " , "Part Time Qualification" , "This free 5-hour workshop will be run in a small, friendly, tutor led group and is suitable for anyone who would like to create a PowerPoint presentation – no prior experience of PowerPoint is required but being able to use the mouse and keyboard is essential. This workshop will show you how to create a dynamic, informative slideshow using text, graphics and animation. During the workshop you will learn how to: create a slide presentation format text and backgrounds insert images create animations and transitions show a PowerPoint presentation" );
            Course Course14 = new Course("Microsoft Word " , "Part Time Qualification" , "Microsoft Word is a popular word processing program that allows you to create documents such as letters, brochures, CVs, reports etc. This FREE 5-hour workshop will be run in a small, friendly, tutor-led group and is suitable for anyone looking to improve their word processing skills – not suitable for complete beginners. During the workshop you will learn: Creating, editing and saving a document Creating folders Formatting text and paragraphs Cut/copy/paste How to check spelling Inserting images, tables etc." );
            Course Course15 = new Course("Stay Safe Online " , "Part Time Qualification" , "Practical advice and support on how to operate safely when using internet sites including: looking at parental controls on Windows PCs and also android and Apple tablets and smart phones how to decide if an email is dangerous how to restrict use within game sites and on social media using the internet securely and confidently for the whole family" );
            Course Course16 = new Course("Web Development – An introduction to HTML " , "Part Time Qualification" , "This web development course is an introduction to HTML focusing on the fundamentals of programming web pages. As well as a gentle introduction we will cover linking pages, file management, site structure, uploading and downloading web pages, domain names, browser compatibility and hosting. This course also introduces you to a range of free applications that enable you to edit pages, upload websites and create images. This short course is the first stage of a 4-part programme of study (HTML, CSS, JavaScript & PHP, and MySQL) that can lead you to developing effective interactive websites and/or mobile web applications." );
            Course Course17 = new Course("Web Development – Styling with CSS " , "Part Time Qualification" , "This web development course enables you to layout and style your pages using CSS. Learn to style your web content by thinking in simple building blocks and understanding the ‘box model’, where you can create mobile-responsive layouts using the flexibility of CSS." );
            mCourses.addAll(Arrays.asList(Course, Course1, Course2, Course3, Course4, Course5, Course6, Course7, Course8, Course9, Course10, Course11, Course12, Course13, Course14, Course15, Course16, Course17));
        }
        // Specify an adapter
        mCourseAdapter = new CourseAdapter(this, mCourses);
        mRecyclerView.setAdapter(mCourseAdapter);


    }
        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                // Respond to the action bar's Up/Home button
                case android.R.id.home:
                    NavUtils.navigateUpFromSameTask(this);
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the options menu from XML
            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.menu, menu);

            // SearchView API Reference: https://developer.android.com/reference/android/widget/SearchView
            // Search Overview: https://developer.android.com/guide/topics/search/
            // Search Widget: https://developer.android.com/guide/topics/search/search-dialog#UsingSearchWidget

            // Get the SearchView and set the searchable configuration
            SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
            SearchView searchView = (SearchView) menu.findItem(R.id.search_view).getActionView();
            // Assumes current activity is the searchable activity
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
            searchView.setIconifiedByDefault(true); // Do not iconify the widget; expand it by default
            searchView.setQueryHint(getString(R.string.search_hint)); // Set query hint
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

                /**
                 * Called when the user submits the query
                 * @param query The query text that is to be submitted
                 * @return False, to let the SearchView perform the default action
                 */
                @Override
                public boolean onQueryTextSubmit(String query) {
                    // Not really needed in our scenario as we're only concerned with the filtering of data
                    return false;
                }

                /**
                 * Called when the query text is changed by the user
                 * @param newText The new content of the query text field
                 * @return False, indicating the SearchView should perform the default action of showing any suggestions if available
                 */
                @Override
                public boolean onQueryTextChange(String newText) {
                    mCourseAdapter.filter(newText); // Filter the items based on the user search query, searching the title of each traffic event for any partial matches
                    mRecyclerView.setAdapter(mCourseAdapter); // Set a new adapter to provide child views on demand
                    mCourseAdapter.notifyDataSetChanged(); // Notify any registered observers that the data set has changed
                    return false;
                }

            }); // On query text listener to listen to changes in the user search query that has been entered
            return true;
        }
    }

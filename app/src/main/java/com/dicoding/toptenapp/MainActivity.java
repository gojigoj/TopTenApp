package com.dicoding.toptenapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.dicoding.toptenapp.Model.ListTopTenAdapter;
import com.dicoding.toptenapp.Model.ProLang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private ImageView ivProfile;
    private RecyclerView rvListProLang;
    private List<ProLang> mListProLang = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        ivProfile = mToolbar.findViewById(R.id.iv_profile_picture);
        ivProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        rvListProLang = findViewById(R.id.rv_list_top);
        rvListProLang.setHasFixedSize(true);
        mListProLang.addAll(setListData());
        showRecyclerList();

    }

    public ArrayList<ProLang> setListData(){
        ArrayList<ProLang> list = new ArrayList<>();
        list.add(new ProLang("Java", 1, "16.884%", "stay", "-0.92%", "https://firebasestorage.googleapis.com/v0/b/uber-app-163b1.appspot.com/o/kisspng-logo-java-runtime-environment-programming-language-java-util-concurrentmodificationexception-%C3%96mer-5b6766ab5dba25.7100170215335031473839.png?alt=media&token=6e2e8bf3-046b-479f-94c7-c43e467d1a09", "Java is a general-purpose programming language that is  class-based, object-oriented (although not a pure object-oriented language, as it contains primitive types), and designed to have as few implementation dependencies as possible.", "#1", "#1",  "James Gosling", "Sun Microsystems", "May 23, 1995"));
        list.add(new ProLang("C", 2, "16.180%", "stay", "+0.80%", "https://firebasestorage.googleapis.com/v0/b/uber-app-163b1.appspot.com/o/PinClipart.com_eclipse-mars-svn_3965857.png?alt=media&token=524ba85c-6938-4a95-9da8-4bc65622d019", "C is a general-purpose, procedural computer programming language supporting structured programming, lexical variable scope, and recursion, while a static type system prevents unintended operations.", "#2", "#2", "Dennis Ritchie", "Dennis Ritchie & Bell Labs", "1972"));
        list.add(new ProLang("Python", 3, "9.089%", "up", "+1.93%", "https://firebasestorage.googleapis.com/v0/b/uber-app-163b1.appspot.com/o/5848152fcef1014c0b5e4967.png?alt=media&token=40e6fd92-7ddb-431c-8546-c9ca8e71c428", "Python is an interpreted, high-level, general-purpose programming language. Created by Guido van Rossum and first released in 1991, Python's design philosophy emphasizes code readability through use of significant whitespace.", "#3", "#4", "Guido van Rossum", "Python Software Foundation", "1990"));
        list.add(new ProLang("C++", 4, "6.229%", "down", "-1.36%", "https://firebasestorage.googleapis.com/v0/b/uber-app-163b1.appspot.com/o/IMGBIN_the-c-programming-language-computer-programming-programmer-png_DLrg2cir.png?alt=media&token=dc1c1f7f-ba86-42a0-a333-e7c03b8aeb0d", "C++ is a general-purpose programming language created by Bjarne Stroustrup as an extension of the C programming language, or \"C with Classes\". The language has expanded significantly over time, and modern C++ has object-oriented, generic, and functional features in addition to facilities for low-level memory manipulation.", "#4", "#3", "Bjarne Stroustrup", "ISO/IEC JTC1/SC22/WG21", "1985"));
        list.add(new ProLang("C#", 5, "3.860%", "up", "+0.37%", "https://firebasestorage.googleapis.com/v0/b/uber-app-163b1.appspot.com/o/IMGBIN_net-framework-c-net-core-software-framework-mono-png_5cqEMJ58.png?alt=media&token=b45ed5fd-9805-48b5-98b2-4e360f8ffddf", "C# is a general-purpose, multi-paradigm programming language encompassing strong typing, lexically scoped, imperative, declarative, functional, generic, object-oriented (class-based), and component-oriented programming disciplines.", "#5", "#6", "Microsoft", "Microsoft", "2000"));
        list.add(new ProLang("Visual Basic .NET", 6, "3.745%", "down", "-2.14%", "https://firebasestorage.googleapis.com/v0/b/uber-app-163b1.appspot.com/o/800px-VB.NET_Logo.svg.png?alt=media&token=59af693f-eb0a-4d06-9c91-7764afc85404", "Visual Basic .NET (VB.NET) is a multi-paradigm, object-oriented programming language, implemented on the .NET Framework. Microsoft launched VB.NET in 2002 as the successor to its original Visual Basic language.", "#6", "#5", "Microsoft", "Microsoft", "2001"));
        list.add(new ProLang("JavaScript", 7, "2.076%", "up", "-0.20%", "https://firebasestorage.googleapis.com/v0/b/uber-app-163b1.appspot.com/o/Javascript-shield.png?alt=media&token=3f5c007a-61d1-409c-a2e4-19a9171c40e8", "JavaScript often abbreviated as JS, is a high-level, interpreted scripting language that conforms to the ECMAScript specification. JavaScript has curly-bracket syntax, dynamic typing, prototype-based object-orientation, and first-class functions.", "#7", "#8", "Brendan Eich", "Ecma International", "December 4, 1995"));
        list.add(new ProLang("SQL", 8, "1.935%", "up", "-0.10%", "https://firebasestorage.googleapis.com/v0/b/uber-app-163b1.appspot.com/o/kisspng-microsoft-azure-sql-database-microsoft-sql-server-database-5abeaece9df699.271102961522446030647.png?alt=media&token=cac56eed-87ba-4cd3-a25e-4fb57038cc84", "SQL is a domain-specific language used in programming and designed for managing data held in a relational database management system (RDBMS), or for stream processing in a relational data stream management system (RDSMS).", "#8", "#9", "Donald D. Chamberlin & Raymond F. Boyce", "ISO/IEC", "1974"));
        list.add(new ProLang("PHP", 9, "1.909%", "down", "-0.89%", "https://firebasestorage.googleapis.com/v0/b/uber-app-163b1.appspot.com/o/58481791cef1014c0b5e4994.png?alt=media&token=00a37e27-6f63-45de-a576-992e6ad46c88", "PHP: Hypertext Preprocessor (or simply PHP) is a general-purpose programming language originally designed for web development. It was originally created by Rasmus Lerdorf in 1994; the PHP reference implementation is now produced by The PHP Group.", "#9", "#7", "Rasmus Lerdorf", "Zend Technologies", "1995"));
        list.add(new ProLang("Objective-C", 10, "1.501%", "up", "+0.30%", "https://firebasestorage.googleapis.com/v0/b/uber-app-163b1.appspot.com/o/PinClipart.com_clip2mp3-converter_3965102.png?alt=media&token=c44679ee-6ba8-4921-8b28-712ac69a2412", "Objective-C is a general-purpose, object-oriented programming language that adds Smalltalk-style messaging to the C programming language. It was the main programming language supported by Apple for the macOS, iOS and iPadOS operating systems, and their respective application programming interfaces", "#10", "#15", "Tom Love and Brad Cox", "Apple", "1984"));

        Collections.sort(list, new SortbyPosition());

        return list;
    }

    class SortbyPosition implements Comparator<ProLang> {

        @Override
        public int compare(ProLang o1, ProLang o2) {
            return o1.getPosition() - o2.getPosition();
        }
    }

    public void showRecyclerList(){
        rvListProLang.setLayoutManager(new LinearLayoutManager(this));
        ListTopTenAdapter listTopTenAdapter = new ListTopTenAdapter(mListProLang);
        rvListProLang.setAdapter(listTopTenAdapter);

        listTopTenAdapter.setOnItemClickCallback(new ListTopTenAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(ProLang data) {
                showSelectedItem(data);
            }
        });
    }

    private void showSelectedItem(ProLang proLang) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("EXTRA_PROLANG", proLang);
        startActivity(intent);
    }


}

//
// Created by Gromyk Juriy on 10/19/2017.
//
#include "TestReader.h"
#include <vector>#include "TestReader.h"
#include <iostream>

TestReader::TestReader() {
    ifstream inFile;
    inFile.open("base.txt", ios_base::out);
    string key, value;

    while (!inFile.eof())
    {
        string buffer;
        getline(inFile, buffer);
        if (!buffer.empty() && key.empty() && buffer != "############") {
            key = buffer;
            continue;
        }
        if (!buffer.empty() && !key.empty()) {
            value = buffer;
        }
        if (!key.empty() && !value.empty()) {
            testBase.insert(pair<string, string>(key, value));
            key.erase();
            value.erase();
        }
    }
}

map<string, string> TestReader::getBaseFromFile() {
    return testBase;
}


/*
vector<string>  split(string text);

vector<string> split(string text) {
    string delims = "!@#$%^&*()_-=+||\\//?><,.		      ";
    vector<string> tokens;
    size_t start = text.find_first_not_of(delims), end = 0;

    while ((end = text.find_first_of(delims, start)) != string::npos)
    {
        tokens.push_back(text.substr(start, end - start));
        start = text.find_first_not_of(delims, end);
    }
    if (start != std::string::npos)
        tokens.push_back(text.substr(start));
    return tokens;
}
*/

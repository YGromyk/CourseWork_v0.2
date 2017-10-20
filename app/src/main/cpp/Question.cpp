//
// Created by Gromyk Juriy on 10/19/2017.
//

#include "Question.h"
#include <vector>
#include <iostream>
#include <fstream>

Question::Question(string _question, string _answer) {
    this->question = _question;
    this->answer = _answer;
}

map<string, string> Question::getQuestion() {
    map<string, string> temp;
    temp.insert(pair<string, string>(this->question, this->answer));
    return temp;
}

fstream& operator>>(fstream& stream, Question &_question)
{

}


vector<string>  split(string text) {
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


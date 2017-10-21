//
// Created by Gromyk Juriy on 10/19/2017.
//

#ifndef COURSESTART_TESTREADER_H
#define COURSESTART_TESTREADER_H

#include <fstream>
#include "Question.h"
#include <list>
class TestReader {
private:
    map<string, string> testBase;
public:
    TestReader();
    map<string, string> getBaseFromFile();
};


#endif //COURSESTART_TESTREADER_H

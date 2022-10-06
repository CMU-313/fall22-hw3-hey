angular.module('docs').controller('Dashboard', function () {
    var dashboard = this;
    dashboard.activeIdx = [0, 3];
    dashboard.stats  = { averageGPA: 0, commonSkills: ["Python", "C", "Leadership"] };
    applicants = [{ name: "John Smith", GPA: 4.0, skills: ["Python", "C++"], other: ["Captian of Soccer Team"] },
    { name: "Alice Baker", GPA: 4.0, skills: ["Java", "Leadership"], other: ["Volunteers at soup kitchens"] },
    { name: "Andy Marshall", GPA: 4.0, skills: ["C", "Biligual"], other: ["Works at local bakery"] },
    { name: "Andrew Carnegie", GPA: 1.0, skills: ["C", "Biligual"], other: ["Works at local bakery"] },
    { name: "Andrew Mellon", GPA: 2.5, skills: ["C", "Cool"], other: ["Works at local bakery"] },
    { name: "Bob Smith", GPA: 4.0, skills: ["C", "Biligual"], other: ["Works at local bakery"] }
    ];

    for (let i = 0; i < 6; i++) {
        // load database with test data
        Restangular.one('applicant').put({
            name: applicants[i]['name'],
            GPA: applicants[i]['GPA'],
            skills: applicants[i]['skills'],
            other: applicants[i]['other']
        }).then(function (data) {
        });
    }

    
    

    dashboard.activeApplicants = dashboard.applicants.slice(0, 3);
    dashboard.getNextThree = function () {
        let [i, j] = dashboard.activeIdx;
        if (j + 3 > dashboard.applicants.length) {
            i = 0
            j = 3
        } else {
            i += 3;
            j += 3;
        }
        dashboard.activeApplicants = dashboard.applicants.slice(i, j);
        dashboard.activeIdx = [i, j];
    };
    dashboard.getPrevThree = function () {
        let [i, j] = dashboard.activeIdx;
        if (i - 3 < 0) {
            i = dashboard.applicants.length - 3;
            j = dashboard.applicants.length;
        } else {
            i -= 3;
            j -= 3;
        }
        dashboard.activeApplicants = dashboard.applicants.slice(i, j);
        dashboard.activeIdx = [i, j];
    };
    dashboard.stats = { averageGPA: 3.9, commonSkills: ["Python", "C", "Leadership"] };
});
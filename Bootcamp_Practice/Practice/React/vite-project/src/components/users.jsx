import React, { useState } from 'react';

const Users = () => {
    const [userList, setUserList] = useState([

        {
            "id": 1,
            "email": "george.bluth@reqres.in",
            "first_name": "George",
            "last_name": "Bluth",
            "avatar": "https://reqres.in/img/faces/1-image.jpg"
        },
        {
            "id": 2,
            "email": "janet.weaver@reqres.in",
            "first_name": "Janet",
            "last_name": "Weaver",
            "avatar": "https://reqres.in/img/faces/2-image.jpg"
        },
        {
            "id": 3,
            "email": "emma.wong@reqres.in",
            "first_name": "Emma",
            "last_name": "Wong",
            "avatar": "https://reqres.in/img/faces/3-image.jpg"
        },
        {
            "id": 4,
            "email": "eve.holt@reqres.in",
            "first_name": "Eve",
            "last_name": "Holt",
            "avatar": "https://reqres.in/img/faces/4-image.jpg"
        },
        {
            "id": 5,
            "email": "charles.morris@reqres.in",
            "first_name": "Charles",
            "last_name": "Morris",
            "avatar": "https://reqres.in/img/faces/5-image.jpg"
        },
        {
            "id": 6,
            "email": "tracey.ramos@reqres.in",
            "first_name": "Tracey",
            "last_name": "Ramos",
            "avatar": "https://reqres.in/img/faces/6-image.jpg"
        },
        {
            "id": 7,
            "email": "michael.lawson@reqres.in",
            "first_name": "Michael",
            "last_name": "Lawson",
            "avatar": "https://reqres.in/img/faces/7-image.jpg"
        },
        {
            "id": 8,
            "email": "lindsay.ferguson@reqres.in",
            "first_name": "Lindsay",
            "last_name": "Ferguson",
            "avatar": "https://reqres.in/img/faces/8-image.jpg"
        },
        {
            "id": 9,
            "email": "tobias.funke@reqres.in",
            "first_name": "Tobias",
            "last_name": "Funke",
            "avatar": "https://reqres.in/img/faces/9-image.jpg"
        },
        {
            "id": 10,
            "email": "byron.fields@reqres.in",
            "first_name": "Byron",
            "last_name": "Fields",
            "avatar": "https://reqres.in/img/faces/10-image.jpg"
        },
        {
            "id": 11,
            "email": "george.edwards@reqres.in",
            "first_name": "George",
            "last_name": "Edwards",
            "avatar": "https://reqres.in/img/faces/11-image.jpg"
        },
        {
            "id": 12,
            "email": "rachel.howell@reqres.in",
            "first_name": "Rachel",
            "last_name": "Howell",
            "avatar": "https://reqres.in/img/faces/12-image.jpg"
        }
    ]);

    const [role, setRole] = useState([
        "Hardware Engineer", "Network Engineer", "Systems Administrator", "DevOps Engineer", "Data Scientist", "Robotics Engineer", "IT Support Specialist", "Cloud Engineer", "Product Manager"
    ])



    return (
        <div className='mt-5'>
            <div className='row'>
                <div className='col-sm-3 col-xs-12'>
                    <ul className="list-group shadow">
                        {role.map(c => (<li className="list-group-item list-group-item-action list-group-item-dark" key={c}><input className="form-check-input me-1" type="checkbox" value="" id="firstCheckbox" />
                            <label className="form-check-label" htmlFor="firstCheckbox"></label>{c}</li>))}
                    </ul>
                </div>
                <div className='col-sm-9 col-xs-12'>
                    <div className="row">
                        {userList.map(p => (
                            <div key={p.id} className='col-lg-3 col-md-4 col-sm-6 col-xm-12 d-flex align-items-stretch mb-3'>
                                <div className="card shadow" >
                                    <img src={p.avatar} style={{ height: "150px" }} className="card-img-top" alt={p.title} />
                                    <div className="card-body" style={{ display: "flex", flexDirection: "column" }}>
                                        <h6 className="card-title">{p.first_name}{p.last_name}</h6>
                                        <p className="card-text text-truncate">{p.email}</p>
                                        <div className='d-grid gap-2 mt-auto'>
                                            <a href="#" className="btn btn-success">Know More</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        ))}
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Users;
